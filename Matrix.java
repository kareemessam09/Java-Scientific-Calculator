package practical;

import java.util.Scanner;

public class Matrix {
	
	private int row = 0;
	private int col = 0;
	int[][] elements = new int[1000][1000];
	private float DeterminantFor2 = 0;
	private float DeterminantFor3 = 0;
	
	

	public void setMatrix(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your matrix Dimentions:");
		System.out.println("Number of Rows:");
		row = sc.nextInt();
		System.out.println("Number of Colomns:");
		col = sc.nextInt();
		System.out.println("Enter the elements of the matrix");
		
	    for (int i = 0; i < row; i++) 
	        for (int j = 0; j < col; j++) 
	            elements[i][j] = sc.nextInt();
	    
	}
	
	public void getMatrix(){
		System.out.println("Elements of the matrix are"); 
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) 
                System.out.print(elements[i][j] + "  "); 
            System.out.println(); 
        } 
	}
	
	
	public void matrixTranspose(){
        System.out.println("The original Matrix:");
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) 
                System.out.print(elements[i][j] + "  "); 
            System.out.println(); 
        } 
        System.out.println("The transpose for the Matrix is:");
		for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) 
                System.out.print(elements[j][i] + "  "); 
            System.out.println(); 
        } 
	}
	
	
	public void inverse() {
		if (canGetInverse()) {
			if (row == 2 && col == 2) {
				inverseOf2();
			}
			if (row == 3 && col == 3) {
				inverseOf3();
			}
		}
		
	}
	
	public void determinant(){
		if (row == 2 && col == 2) {
			getDeterminantFor2();
			
		}
		if (row == 3 && col == 3) {
			getDeterminantFor3();
		}

	}
	
	
	
	public boolean canGetInverse(){
		return row == col;
	}
	
	
	public void getDeterminantFor3(){
		float determinant = 0;
		if (canGetInverse()) {
			
			determinant += elements[0][0]*((elements[1][1]*elements[2][2]) - (elements[1][2]*elements[2][1]));
			determinant -= elements[0][1]*((elements[1][0]*elements[2][2]) - (elements[1][2]*elements[2][0]));
			determinant += elements[0][2]*((elements[1][0]*elements[2][1]) - (elements[1][1]*elements[2][0]));
			
			System.out.println("Determinant: " + determinant);
			
		}
		DeterminantFor3 = determinant;
	}
	public float determinantFor3(){
		return DeterminantFor3;
	}
	public void inverseOf3() {
		if (canGetInverse()) {
			getDeterminantFor3();
			float [][] newMatrix = new float [3][3];
			
			newMatrix[0][0] = ((elements[1][1]*elements[2][2]) - (elements[1][2]*elements[2][1]));
			newMatrix[0][1] = -((elements[0][1]*elements[2][2]) - (elements[0][2]*elements[2][1]));
			newMatrix[0][2] = ((elements[0][1]*elements[1][2]) - (elements[0][2]*elements[1][1]));
			
			newMatrix[1][0] = -((elements[1][0]*elements[2][2]) - (elements[1][2]*elements[2][0]));
			newMatrix[1][1] = ((elements[0][0]*elements[2][2]) - (elements[0][2]*elements[2][0]));
			newMatrix[1][2] = -((elements[0][0]*elements[1][2]) - (elements[0][2]*elements[1][0]));
			
			newMatrix[2][0] = ((elements[1][0]*elements[2][1]) - (elements[1][1]*elements[2][0]));
			newMatrix[2][1] = -((elements[0][0]*elements[2][1]) - (elements[0][1]*elements[2][0]));
			newMatrix[2][2] = ((elements[0][0]*elements[1][1]) - (elements[0][1]*elements[1][0]));
			
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					newMatrix[i][j] *= 1/determinantFor3();
					
					if (newMatrix[i][j] == 0) newMatrix[i][j] = 0;
				}
			}
			
			System.out.println("The inverse of the MATRIX is:");
			
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(newMatrix[i][j] + " ");
				}
				System.out.print("\n");
			}
		}else {
			System.out.println("Your Matrix Should be Squared!!"); 
		}
	}
		

	
	public void getDeterminantFor2(){
		float determinant = 0;
		if (canGetInverse()) {
			determinant = (elements[0][0] * elements[1][1]) - (elements[0][1] * elements[1][0]);
			System.out.println("Determinant: " + determinant);
		}
		DeterminantFor2 = determinant;
	}
	public float determinantFor2(){
		return DeterminantFor2;
	}
	public void inverseOf2(){
		if (canGetInverse()) {
			getDeterminantFor2();
			int temp;
			temp = elements[0][0];
			elements[0][0] = elements[1][1];
			elements[1][1] = temp;
			elements[0][1] = - elements[0][1];
			elements[1][0] = - elements[1][0];
			System.out.println("The inverse of the MATRIX is:"); 
	        for (int i = 0; i < row; i++) { 
	            for (int j = 0; j < col; j++) 
	                System.out.print(elements[i][j]/determinantFor2() + "  "); 
	            System.out.println(); 
	        } 
			
		}else {
            System.out.println("Your Matrix Should be Squared!!"); 
		}
		
	}
	
	
	
	public void addTwoMatrices() {
		Matrix firstMatrix = new Matrix();
		System.out.println("The first matrix dimention: ");
		firstMatrix.setMatrix();
		Matrix secondMatrix = new Matrix();
		System.out.println("The Second matrix dimention: ");

		secondMatrix.setMatrix();
		
        if (firstMatrix.row != secondMatrix.row || firstMatrix.col != secondMatrix.col) {
            System.out.println("Matrices must have the same dimensions for addition.");
        }

        Matrix result = new Matrix();
        result.row = firstMatrix.row;
        result.col = firstMatrix.col;

        for (int i = 0; i < firstMatrix.row; i++) {
            for (int j = 0; j < firstMatrix.col; j++) {
                result.elements[i][j] = firstMatrix.elements[i][j] + secondMatrix.elements[i][j];
            }
        }

        result.getMatrix();
    }
	
	public void susbstractTwoMatrices() {
		Matrix firstMatrix = new Matrix();
		System.out.println("The first matrix dimention: ");
		firstMatrix.setMatrix();
		Matrix secondMatrix = new Matrix();
		System.out.println("The Second matrix dimention: ");
		secondMatrix.setMatrix();
		
        if (firstMatrix.row != secondMatrix.row || firstMatrix.col != secondMatrix.col) {
            System.out.println("Matrices must have the same dimensions for addition.");
        }

        Matrix result = new Matrix();
        result.row = firstMatrix.row;
        result.col = firstMatrix.col;

        for (int i = 0; i < firstMatrix.row; i++) {
            for (int j = 0; j < firstMatrix.col; j++) {
                result.elements[i][j] = firstMatrix.elements[i][j] - secondMatrix.elements[i][j];
            }
        }

        result.getMatrix();
    }
	
	public void multiplyTwoMatrices(){
		Matrix firstMatrix = new Matrix();
		System.out.println("The first matrix dimention: ");
		firstMatrix.setMatrix();
		Matrix secondMatrix = new Matrix();
		System.out.println("The Second matrix dimention: ");
		secondMatrix.setMatrix();
		
		 Matrix result = new Matrix();
		 
		if (firstMatrix.col == secondMatrix.row) {
		        result.row = firstMatrix.row;
		        result.col = secondMatrix.col;
		        
		        for(int i=0; i<result.row; i++){    
		        	for(int j=0; j<result.col; j++){    
		        		result.elements[i][j]=0;      
		        			for(int k=0;k<secondMatrix.row;k++)      
		        			{      
		        				result.elements[i][j]+=firstMatrix.elements[i][k]*secondMatrix.elements[k][j];      
		        			} 
		        		}
				
		        	}
        }else {
        	System.out.println("to multiply two Matrices the first matrix coloumns should equals the second matrix rows!");

		}
       
	result.getMatrix();
}
}
