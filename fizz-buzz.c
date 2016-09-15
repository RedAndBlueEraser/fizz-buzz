/*
 * fizz-buzz.c
 * Version 20160915
 * Written by Harry Wong (RedAndBlueEraser)
 */

#include <stdio.h>

#define FIZZ_BUZZ_MAX_LENGTH 50

/* Prints the fizz buzz sequence of specified length to stdout. */
void print_fizz_buzz(int length);

int main(int argc, char *argv[]) {
    print_fizz_buzz(FIZZ_BUZZ_MAX_LENGTH);
    printf("\n");
    return 0;
}

void print_fizz_buzz(int length) {
    /* Iteration over fizz buzz sequence. */
    int i;

    /* Iterate over fizz buzz sequence. */
    for (i = 1; i <= length; i++) {
        /* Iteration is divisible by 3; print "Fizz". */
        if (i % 3 == 0) {
            printf("Fizz");
            /* Iteration is divisible by 3 and 5; print "Buzz" after "Fizz". */
            if (i % 5 == 0) {
                printf(" Buzz");
            }
        }

        /* Iteration is divisible by 5; print "Buzz". */
        else if (i % 5 == 0) {
            printf("Buzz");
        }

        /* Print iteration. */
        else {
            printf("%d", i);
        }

        /* Separate values with a comma except for last value. */
        if (i != length) {
            printf(", ");
        }
    }
}
