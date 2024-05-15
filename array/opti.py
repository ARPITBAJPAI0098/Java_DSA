import numpy as np
from scipy.optimize import linear_sum_assignment

# Define the time matrix
time_matrix = np.array([
    [18, 26, 17, 11],
    [13, 28, 14, 26],
    [38, 19, 18, 15],
    [19, 26, 24, 10],
])

# Find the optimal assignment using the linear_sum_assignment function
row_ind, col_ind = linear_sum_assignment(time_matrix)
assignment = np.zeros((time_matrix.shape[0], time_matrix.shape[1]), dtype=bool)
assignment[row_ind, col_ind] = True

# Calculate the total man-hours
total_man_hours = np.sum(time_matrix[assignment])

# Display the optimal assignment and total man-hours
print("Optimal assignment:")
print(assignment)
print("Total man-hours:", total_man_hours)