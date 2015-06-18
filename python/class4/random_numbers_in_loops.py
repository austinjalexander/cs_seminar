import random

random_value = random.randint(1,10) # [1,10]

print "\nRandom value [1,10]: " + str(random_value)

print "\n20 Random Values [1,10]:"
for i in range(20): # 0 .. 19   (so 20 loops total)
    random_value = random.randint(1,10)
    print random_value # won't print in a single line
    
print 


### to print in a single line
#print "\n20 Random Values [1,10]:"
#random_values = [] # store values in a list/array
#for i in range(20):
#    random_values.append(random.randint(1,10))
#    
#print "\t" + str(random_values)
