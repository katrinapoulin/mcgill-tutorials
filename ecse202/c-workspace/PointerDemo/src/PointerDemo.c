/*
 ============================================================================
 Name        : PointerDemo.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int array[] = {1, 2};
	int* a = malloc (2*sizeof(int));
	a[0] = 1;
	a[1] = 2;
	a[2] = 3;
	printf("%d\n", *(array + 1));
	printf("%p, %p, %p\n", (a), ((void*)a + 1), &a[1]);

}
