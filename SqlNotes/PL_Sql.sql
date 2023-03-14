/*Task1:Sum of n natural numbers*/
SQL> declare
  2  i number;
  3  s number;
  4  begin
  5  s:=0;
  6  for i IN 1..10 loop
  7  s:=s+i;
  8  end loop;
  9  dbms_output.put_line('Sum ='||s);
 10  end;
 11  /
Sum =55

PL/SQL procedure successfully completed.
/*Task1 using while loop:*/
SQL> declare
  2  i number;
  3  s number;
  4  begin
  5  i:=1;
  6  s:=0;
  7  while(i<=10)
  8  loop
  9  s:=s+i;
 10  i:=i+1;
 11  end loop;
 12  dbms_output.put_line('Sum of 10 natural numbers is '||s);
 13  end;
 14  /
Sum of 10 natural numbers is 55

PL/SQL procedure successfully completed.c

/*Task2: Sum of n even natural numbers */

SQL> declare
  2  i number;
  3  n number;
  4  s number;
  5  begin
  6  i:=0;
  7  s:=0;
  8  n:=&n;
  9  while(i<=n)
 10  loop
 11  s:=s+i;
 12  i:=i+2;
 13  end loop;
 14  dbms_output.put_line('Sum of '||n||' even natural numbers is '||s);
 15  end;
 16  /
Enter value for n: 10
Sum of 10 even natural numbers is 30

PL/SQL procedure successfully completed.

/*Task3: HCF of two numbers by taking input from user*/
SQL> declare
  2  num1 number;
  3  num2 number;
  4  hcf number;
  5  begin
  6  num1:=&num1;
  7  num2:=&num2;
  8  while MOD(num2,num1)!=0
  9  loop
 10  hcf:=MOD(num2,num1);
 11  num2:=num1;
 12  num1:=hcf;
 13  end loop;
 14  dbms_output.put_line('HCF of '||num1||' and '||num2||' is '||num1);
 15  end;
 16  /
Enter value for num1: 8
Enter value for num2: 48
HCF of 8 and 48 is 8

PL/SQL procedure successfully completed.