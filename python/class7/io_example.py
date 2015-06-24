#with open('data.txt', 'r') as f:
#    data = f.read()
#    print f.read()
 
#with open('data.txt', 'w') as f:
#    f.write('mo stuff')

#with open('data.txt', 'a') as f:
#    f.write("\nadditional data")

# this is a block that reads and writes  
with open('data.txt', 'r+') as f:
    data = f.read()
    print data
    f.write('\nr+ rox')
    data = f.read()
    print data

