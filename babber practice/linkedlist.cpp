
#include <stdio.h>
#include <stdlib.h>

int main() {
    int rows, cols, i, j;

    printf("Enter number of rows: ");
    scanf("%d", &rows);

    printf("Enter number of columns: ");
    scanf("%d", &cols);

    
    int **matrix = (int **)malloc(rows * sizeof(int *));

   
    for(i = 0; i < rows; i++) {
        matrix[i] = (int *)malloc(cols * sizeof(int));
    }

    
    for(i = 0; i < rows; i++) {
        for(j = 0; j < cols; j++) {
            printf("Enter element at row %d, column %d: ", i+1, j+1);
            scanf("%d", &matrix[i][j]);
        }
    }


    printf("\nMatrix:\n");
    for(i = 0; i < rows; i++) {
        for(j = 0; j < cols; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf("\n");
    }

   
    for(i = 0; i < rows; i++) {
        free(matrix[i]);
    }

    return 0;
}
