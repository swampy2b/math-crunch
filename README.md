# math-crunch

reused library: (https://github.com/basoltanifarWVUMix/program1)

### Run math-crunch
Pass the operation and operands you want to execute to math-crunch as command line parameters
to add:

```
Specify a valid operation:
  math-crunch [operation] [operands..]
  Valid operations are:
   --add num1 num2
   --subtract num1 num2
   --multiply num1 num2
   --divide num1 num2
   --power num1 num2
   --sqrt num1
   --convert num1 [decimal | binary | octal | hexa]       
```
For example:
```
math-crunch --add 5 7
```
For the ```--convert``` action, the convert to base defaults to "decimal" if not specified.
Other operations follow as one might expect

### Reuse Library

The Arithmetic library was simple to use for the base arithmetic operations.

The conversion was more complex.  It wasn't immediately obvious that the convert function always converts to all other base types.  Needed a wrapper function to select a specific conversion, which hadn't planned for, basing operation on the test case.  Works really well once figured out though.
