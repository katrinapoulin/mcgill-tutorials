/*
 ============================================================================
 Name        : PointerManipulation.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

// char[] argv
// char argv[]
int main(int argc, char *argv[]) {
	//argc  # of arguments
	// argv = arguments
	int x = 5;
	int *p = &x;

	// d -> digit
	// p -> pointer
	// f -> float (doubles)
	// s -> string
	// c -> char
	printf("x = %d\n", x);
	printf("&x = %p\n", &x);
	printf("p = %p\n", p);
	printf("*p = %d\n", *p);
	printf("&p = %p\n", &p);

}
