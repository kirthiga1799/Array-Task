package com.zoho;

import java.util.Scanner;

public class Ques4_Matrix {
	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the no of rows for the 1st matrix: ");
		        int rowsA = scanner.nextInt();
		        System.out.print("Enter the no of col for the 2nd matrix: ");
		        int colsA = scanner.nextInt();

		        System.out.print("Enter the no of rows for the 2nd matrix: ");
		        int rowsB = scanner.nextInt();
		        System.out.print("Enter the no of columns for the 2nd matrix: ");
		        int colsB = scanner.nextInt();	

		        if (colsA != rowsB) {
		            System.out.println("Matrix multiplication is not possible.");
		           return;
		        }
		        int[][] A = new int[rowsA][colsA];
		        int[][] B = new int[rowsB][colsB];

		        System.out.println("Enter elements of the first matrix:");
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsA; j++) {
		                A[i][j] = scanner.nextInt();
		            }
		        }

		        System.out.println("Enter elements of the second matrix:");
		        for (int i = 0; i < rowsB; i++) {
		            for (int j = 0; j < colsB; j++) {
		                B[i][j] = scanner.nextInt();
		            }
		        }

		        int[][] resultMatrix = new int[rowsA][colsB];

		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                for (int k = 0; k < colsA; k++) {
		                    resultMatrix[i][j] += A[i][k] * B[k][j];
		                }
		            }
		        }

		        System.out.println("Resultant matrix after multiplication:");
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                System.out.print(resultMatrix[i][j] + " ");
		            }
		            System.out.println();
		        }

		        scanner.close();
		    }
		}


