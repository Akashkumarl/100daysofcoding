Question :   Write a program to find the Factors of a number
  
                        SOURCE CODE
    
num=int(input("Enter a number: "))
n = num/2
for i in range(1,num):
 if num % i == 0:
  print(i)

                                 OUTPUT
Enter a number: 6
1
2
3     
