/*
 ============================================================================
 Name        : Stack.c
 Author      : kpoulin
 Version     :
 Copyright   : Your copyright notice
 Description : Stack program
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

// static vars here (instance variables....)
// constants

typedef struct listNode {
	char* data;
	struct listNode* next;
} listNode;


listNode* top = NULL;


// function prototypes <3
void push(char data[]);

int main() {
	push();
}

void push(char data[]) {
	// create listNode
	listNode* node = (listNode*)malloc(sizeof(listNode));
	// assign listNode data
	(*node).data = data;
	// node->data = data;
	(*node).next = top;
	top = node;
	// change top of stack
}



/*
 * class Stack {
 * 		listNode top;
 *
 * 		class listNode {
 * 			int data;
 * 			listNode next;
 * 		}
 * }
 */
