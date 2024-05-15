# 1. Nested Loop Pattern
def nested_pattern(rows):
    for i in range(rows + 1):
        for j in range(i):
            print("*", end=" ")
        print()

# Take input for the number of rows
rows_input = int(input("Enter the number of rows for the pattern: "))
nested_pattern(rows_input)

# 2. Fibonacci Series
def fibonacci_series(limit):
    a, b = 0, 1
    while a < limit:
        print(a, end=" ")
        a, b = b, a + b

# Take input for the limit of Fibonacci series
limit_input = int(input("Enter the limit for the Fibonacci series: "))
fibonacci_series(limit_input)

# 3. Check Vowel or Consonant
def check_alphabet(letter):
    vowels = ['a', 'e', 'i', 'o', 'u']
    if letter.lower() in vowels:
        return f"{letter} is a vowel"
    else:
        return f"{letter} is a consonant"

# Take input for the alphabet
alphabet_input = input("Enter a letter of the alphabet: ")
print(check_alphabet(alphabet_input))

# 4. Sum of Numbers in a List
def sum_numbers(numbers):
    result = 0
    for num in numbers:
        result += num
    return result

# Take input for the list of numbers
numbers_input = list(map(int, input("Enter numbers separated by space: ").split()))
print("Sum of numbers:", sum_numbers(numbers_input))

# 5. Factorial Function
def factorial(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

# Take input for the number to calculate factorial
num_for_factorial = int(input("Enter a non-negative integer for factorial calculation: "))
print("Factorial:", factorial(num_for_factorial))

# 6. Maximum of Three Numbers
def find_max(num1, num2, num3):
    max_num = num1
    if num2 > max_num:
        max_num = num2
    if num3 > max_num:
        max_num = num3
    return max_num

# Take input for three numbers
num1_input = float(input("Enter the first number: "))
num2_input = float(input("Enter the second number: "))
num3_input = float(input("Enter the third number: "))
print("Maximum:", find_max(num1_input, num2_input, num3_input))

# 7. Calculate Voltage
def calculate_voltage(R, I):
    return R * I

# Take input for resistance (R) and current (I)
R_input = float(input("Enter the resistance (R): "))
I_input = float(input("Enter the current (I): "))
print("Voltage:", calculate_voltage(R_input, I_input))

# 8. Equivalent Resistance in Series
def equivalent_resistance_series(resistances):
    result = 0
    for resistance in resistances:
        result += resistance
    return result

# Take input for resistances in series
resistances_series_input = list(map(float, input("Enter resistances in series separated by space: ").split()))
print("Equivalent Resistance in Series:", equivalent_resistance_series(resistances_series_input))

# 9. RMS Voltage and Current
def calculate_rms_voltage(current, peak_voltage):
    return peak_voltage / (2 ** 0.5)

# Take input for current and peak voltage
current_input = float(input("Enter the current for RMS calculation: "))
peak_voltage_input = float(input("Enter the peak voltage for RMS calculation: "))
print("RMS Voltage:", calculate_rms_voltage(current_input, peak_voltage_input))

# 10. Voltage Divider Circuit
def voltage_divider_circuit(Vin, R1, R2):
    return (R2 / (R1 + R2)) * Vin

# Take input for input voltage (Vin), R1, and R2
Vin_input = float(input("Enter the input voltage (Vin): "))
R1_input = float(input("Enter the resistance R1: "))
R2_input = float(input("Enter the resistance R2: "))
print("Output Voltage from Voltage Divider Circuit:", voltage_divider_circuit(Vin_input, R1_input, R2_input))
