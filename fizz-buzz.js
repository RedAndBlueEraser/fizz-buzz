/*
 * fizz-buzz.js
 * Version 20160915
 * Written by Harry Wong (RedAndBlueEraser)
 */

function getFizzBuzz(length) {
    var i,              // Iteration over fizz buzz sequence.
        fizzBuzz = '';  // Fizz buzz sequence string.

    // Iterate over fizz buzz sequence.
    for (i = 1; i <= length; i++) {
        // Iteration is divisible by 3; add "Fizz".
        if (i % 3 === 0) {
            fizzBuzz += 'Fizz';
            // Iteration is divisible by 3 and 5; add "Buzz" after "Fizz".
            if (i % 5 === 0) {
                fizzBuzz += ' Buzz';
            }
        }

        // Iteration is divisible by 5; add "Buzz".
        else if (i % 5 === 0) {
            fizzBuzz += 'Buzz';
        }

        // Add iteration.
        else {
            fizzBuzz += i;
        }

        // Separate values with a comma except for last value.
        if (i != length) {
            fizzBuzz += ', ';
        }
    }

    return fizzBuzz;
}

alert(getFizzBuzz(50));
