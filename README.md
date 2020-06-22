# LambdaStreamNumericia
Lambda and Streams examples on Numeric sequences and String Sequences with focus on 4 major areas

## Functional Interface flash reference samples

* Behavior parameterization: The ability of a method to receive multiple different behavior as its parameter and use them internally to accomplish the task. In other words, passing the logic of the method or passing the behavior as argument. Passing methods as parameter removes verbosity from the code and in fact increases reusability.


* Predicate: Takes a input and returns a boolean result 

	e.g. Predicate<Integer> isPredicate = x -> x%2 == 0;


* BiPredicate: Takes two inputs for the expression and returns a boolean result

	e.g BiPredicate<String,Integer> biPredicate = (number, str) -> {
		return number<10 && str.length()>5;
	};


* Function: Takes a input and returns a value

	e.g. Function<Integer, Integer> squareFunction = x * x;
	or   Function<Integer, String> squareFunction = x + " ";


* BiFunction: Takes two inputs and returns a value back. Also need to specify the return type
	
	e.g. BiFunction<Integer, Integer, String> squareFunction = (x,y) -> x * x + " ";

* Consumer: Takes a input and processes(consumes) it(no return)
		
	e.g. Consumer<Integer> sysoConsumer = x -> System.out.println(x);


* BiConsumer: Takes 2 inputs and process(consumes) it

	e.g. BiConsumer<Integer,String> biConsumer = (x,str) -> System.out.println(x + str);
	biConsumer.accept(15,"No pain, no gain");

* Binary Operator: Takes 2 operands of same type as input and return the output of the same type

	e.g. BinaryOperatorInteger sumBinaryOperator = (x,y) -> x * y;

* Supplier: No input, and returns something

	e.g. Supplier<Integer> randomIntegerSupplier = () -> {
	Random random = new Random();
	return random.nextInt(1000);
	};
	System.out.println(randomIntegerSupplier.get());
	
	
* UnaryOperator: Takes one parameter as input and returns the same type of paramter as output

	e.g. UnaryOperator<Integer> unaryOperator = x -> x *3;
		  System.out.println(unaryOperator.apply(10)); 


* Method references: Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference

	e.g. courses.streams()
	.map(String::toUpperCase)//Method on the object
	.forEach(CLASSNAME::print) 
	
* Method Reference for Constructor reference

	e.g. Supplier<String> str = () -> new String();
	can be written as  Supplier<String> str = String::new; //Constructor Reference
	
	
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
