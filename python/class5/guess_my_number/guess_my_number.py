import random

print "\n\t<<<< GUESS MY NUMBER : THE GAME >>>>\n"
        
random_value = random.randint(1,20) # [1,20] # no need to add 1 like in the java example
        
user_input = input("\nPlease guess my number (1-20): ")

if user_input == random_value:
    print "\n\tYOU DID IT!!!\n"
else:
    print "\n\tYOU'RE WRONG!!!   >:(\n"
    print "\tThe number was: ", random_value, "\n"
    
    new_random_value = random.randint(1,20)
    while random_value == new_random_value:
        new_random_value = random.randint(1,20)
        
    print "\tThe number was also definitely not: ", new_random_value, "\n"
