#code to plot bar graph
import matplotlib.pyplot as plt;


categories = ['mk1', 'mk2', 'mk3', 'mk4']
values = [10, 15, 7, 12]

plt.bar(category, values)

plt.xlabel('marks')
plt.ylabel('Values')
plt.title('Bar Graph sample')

plt.show()
