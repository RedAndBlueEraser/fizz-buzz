# fizz-buzz.py
# Version 20160915
# Written by Harry Wong (RedAndBlueEraser)

def get_fizz_buzz(len):
    fizz_buzz = ""    # Fizz buzz sequence string.

    for i in range(1, len + 1):
        # Iteration is divisible by 3; add "Fizz".
        if i % 3 == 0:
            fizz_buzz += "Fizz"
            # Iteration is divisible by 5; add "Buzz" after "Fizz".
            if i % 5 == 0:
                fizz_buzz += " Buzz"

        # Iteration is divisible by 5; add "Buzz".
        elif i % 5 == 0:
            fizz_buzz += "Buzz"

        # Add iteration.
        else:
            fizz_buzz += str(i)

        # Separate values with a comma except for last value.
        if i != len:
            fizz_buzz += ", "

    return fizz_buzz

print get_fizz_buzz(50)
