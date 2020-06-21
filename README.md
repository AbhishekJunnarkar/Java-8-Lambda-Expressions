# LambdaStreamNumericia
Lambda and Streams examples on Numeric sequences and String Sequences with focus on 4 major areas

## Simple definitions

* Predicate: Takes a input and returns a boolean result 
> e.g. Predicate<Integer> isPredicate = x -> x%2 == 0;

* Function: Takes a input and returns a value

* Consumer: Takes a input and processes it(no return)

* Binary Operator: Takes 2 operands as input and return the output of the same type
* Behavior parameterization: The ability of a method to receive multiple different behavior as its parameter and use them internally to accomplish the task. Inother words, passing the logic of the method or passing the behavior as argument. Passing methods as parameter removes verbosity from the code and in fact increases reusability.
* Streams helps in writing SQL like syntaxes, parallelization that is almost free:- speed of the execution with efficient use of modern computers having multicore processors
* Optional for handling null, its a container object used for handling not-null objects

## Numeric sequences Examples in Code
* addNumericsusingPredefinedFunctionAddOfIntegerClass(numbers);
* addNumericswithsumMethod(numbers);
* addNumericswithlambda(numbers);
* findGreatestEntity(numbers);
* squareEveryNumberAndFindSumOfSquares(numbers);
* cubeEveryNumberAndFindSumOfCubes(numbers);

## String sequences Examples in code
* printFamilyTreesortedNaturalOrder(members);
* printFamilyTreesortedSizeofCharsusingComparator(members);
* printFamilyMembersNameStartingWithA(members);
* printFamilyMembersNameHaving5Characters(members);
* printNumberofCharactersinEachName(members);

## Method references Examples in code
* methodReferenceExample(members);
* methodReferenceExampleSysoSolution(numbers);
* methodReferenceExampleOrderdSysoSolution(numbers);
* methodReferenceExampleDistinctSysoSolution(numbers);		
* methodReferenceExampleSysoSolution(numbers);
* methodReferenceExampleOrderdSysoSolution(numbers);
