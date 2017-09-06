1. 
a. byte == 8 bits
b. int ==  32 bits
c. long == 64 bits
d. double == 64 bits
f. float == 32 bits

2.
x ==  9
y == 1
z == 30
w == 9

3.
x == -10
y == 4
z == 2
w == 0

4.
z == emersonlakepalmer
w == 3emersonlakepalmer34

5.
a = a + b;
b = a - b;
a = a - b;

6.
public static int theMiddle(int one, int two, int three) {
	if (one >= two) {
		if (two >= three) {
			return two
		}
		if (three >= one) {
			return one;
		}
		return three;
	}
	if (two > one) {
		if (one >= three) {
			return one;
		}
		if (three >= two) {
			return two;
		}
		return three;
	}
	
7. 
public static double cylinderVolume(double dValue, double hValue) {
	vValue = Math.PI * Math.pow((dValue/2), 2) * hValue;
	return vValue;
}

8. public static boolean allPositive(double valueA, valueB, valueC) {
	return (valueA > 0) && (valueB > 0) && (valueC > 0);
}

9. public static boolean validTriangle(double sideA, sideB, sideC) {
	return (sideA < sideB + sideC) && (sideB <sideA + sideC) && (sideC < sideA + sideB);
}

10. public static boolean rightAngle(double sideA, sideB, sideC) {
	int sideLong;
	int sideShort1;
	int sideShort2;
	
	if (sideA > sideB) && (sideA > sideC) {
		sideLong = sideA;
		sideShort1 = sideB
		sideShort2 = side C
	}
	else if (sideB > sideA) && (sideB > sideC) {
		sideLong = sideB;
		sideShort1 = sideA;
		sideShort2 = sideC;
	}
	else if (sideC > sideB) && (sideC > sideA) {
		sideLong = side C;
		sideShort1 = sideA;
		sideShort2 = sideB;
	}
	else {
		return false;
	}
	
	return (sideA < sideB + sideC) && (sideB < sideA + sideC) && (sideC < sideA + sideB)
			&& (Math.pow(sideShort1, 2) + Math.pow(sideShort2, 2) == Math.pow(sideLong, 2));
}

11. 
	for (int i = 1; i < 9; i +=2) {
		System.out.printf("%03d:%n" , i);
	}
	
12. 
	for(int i = 1; i < 9; i +=2) {
		if (i == 7) {
			System.out.println("007,007);
		}
		else {
			System.out.printf("%03d,%03d%n" , i , i + 1);
		}
	}
	
13. 
	for(int i = 100; i >= 16; i-=12) {
		System.out.printf("%3d!", i) 
	}

14.
	for (int i = 0; i < word.length(); i++) {
		System.out.println(word.charAt(i));
	}
15.

	for (int i = 0; i < word.length(); i++) {
		System.out.println(word.substring(i, word.length - 1));
	}

16. 
	int i = 2
	while (i < 10) {
		System.out.printf("%03d:%n" , i);
		i += 2;
	}
	
17.	
	for (int j = 1; j < 9; j += 2) {
		int i = j;
		
		for (i; i < 9; i++) {
			System.out.print(i);
		}
	}
	
18.
	for (int j = 0; j < 5; j++ ) {
		System.out.println();
		for (int i = 9 - j; i > j; i--) {
			System.out.print(i);
		}
	}
	
19.	double i = 1.0;
	do {
		
		if ((i - 7 < .001) && (i - 7 > -.001)) {
			System.out.println("007.0,007.0");
		}
		else {
		System.out.printf("%03.1f,%03.1f%n" , i, i + 1)
		}
		i+=2;
	} while (i <= 9);
	
	int i = 1024
20. while (i > 0) {
		System.out.printf("%+04d?", i);
		i = i/2;
	}
	
21. int index = 1
	do {
		System.out.println(index);
		index += 3;
	} while (index <=15);
	
22. do {
		System.out.print("Enter an int: ");
		a = keyboard.nextInt();
	} while (a != 0);
	return a;
	
23. int index = 10
	while (index >= 0) {
		System.out.prinln(index);
		index -= 2;
	}
	int i = word.length - 1;
24. while (i >= 0) {
		System.out.println(word.substring( i , word.length - 1);
		i--;
	}
	
25.
	12345x
	2345x
	345x
	
	

26.

=0
=01
=012
=0123
=01234

27.

@
5@
54@
543@
5432@
54321@

28.

51015202530#
611162126#
1217#
#
#
#

29.

1
2
4
8
16
32
64
128
256
512

10 LINES OF OUTPUT

30. 

int a;
if (a == 1) {
	System.out.println("A");
}
else if (a == 2) {
	System.out.println("B");
}
else if (a == 3) {
	System.out.println("C");
}

31.

if (a == 1) {
	System.out.println("XY");
}
else if (a == 2) {
	System.out.println("Y");
}
else if (a == 3) {
	System.out.println("Z");
}

32.

if (a == 1) {
	System.out.println("iiiiii");
}
else if (a == 2) {
	System.out.println("iiiii");
}
else if (a == 3) {
	System.out.println("iii");
}
else {
	System.out.println("iv");
}

33.

switch (a) {
	case 0: System.out.println("A"); break;
	case 1: System.out.println("B"); break;
	default: System.out.println("C");
}

34.

switch (a) {
	case 0: System.out.println("F"); break;
	case 1: System.out.println("T");
}

35.

if (a == 0) {
	System.out.println("X");
}
else if (a == 1) {
	System.out.println("Y");
}
else if (a == 2 || a == 3) {
	if (a == 3) {
		System.out.println("W");
	}
	System.out.print("Z");
}
else {
	System.out.println("?");
}

36.

(a) 11.0
(b) 13.0
(c) 7.0
(d) 8.0

37. 

(a) 27
(b) 20
(c) 77

38. 

(a) 1
(b) 4
(c) 8
(d) 17
(e) 19
(f) SINGIN' IN THE RAIN
(g) S

39.  .trim()

40.  .exists()

41.  .canRead()

42.  .getName()

43.  .sort

44. arrays.fill

45. arrayindexoutofboundsexception

46. .equals()

47. replace() 

48. TRUE

49. FALSE

50. FALSE

51. false

52. FALSE

53. FALSE

54.

public static int casino() {
	Random number = new Random();
	do {
	int casino = number.nextInt(20)) 
	} while (casino < 10);
	return casino;
}

55. 

public static int jackpot() {
	Random number = new Random();
	do {
	int casino = number.nextInt(20)) 
	} while ((casino < 10) || (casino % 2 == 0));
	return casino;
}

56. 

(a) 20
(b) 11
(c) 10

57.

(a) 
4

(b)
2

(c)
5

58.

(a)
3

(b)
2

(c)
1

59.

public static boolean isIncreasing(int[] series) {
	int max = series[0]
	for (int i = 1; i < series.length; i++) {
		if (series[i] > max) {
			max = series[i];
		}
		else {
			return false;
		}
	}
	return true;
}

60.

public static boolean isDecreasing(int[] series) {
	int min = series[0]
	for (int i = 1; i < series.length; i++) {
		if (series[i] < min) {
			min = series[i];
		}
		else {
			return false;
		}
	}
	return true;
}

61.

public static boolean isDistinct(int[] series) {
	for(int i = 0; i < series.length() - 1; i++) {
		if (series[i] == series[i + 1]) {
			return false;
		}
	}
	return true;
}

62. 

public static boolean evenParityCheck(int[] series) {
	for (int i = 2; i < series.length; i+=2) {
		if (series[i] % 2 != 0) {
			return false;
		}
	}
	return true;
}

63.

public static boolean allParityCheck(int[] series) {
	for (int i = 1; i < series.length; i++) {
		if ((i % 2 == 0) && (series[i] % 2 != 0)) {
			return false;
		}
		if ((i % 2 == 1) && (series[i] % 2 != 1)) {
			return false;
		}
	}
	return true;
}

64.

public DoWhat(String word, int quantity) {
	this.word = word;
	this.quantity = quantity;
}

65.

public String getWord() {
	return this.word;
}

66.

public int getQuantity() {
	return this.quantity;
}

67.

a
10.5
bb
20.5
ccc
-30.5

6 lines

68. 
a      10.5
bb     20.5

ccc   -30.5

4 lines

69.

5

70.

225

71.

true

72.

true

73.  subclass, superclass, obj instanceof Foobar, (foo), polymorphism

74. runtime, arrayindexoutofbounds, try-catch, try, catch

75. implements,   , abstract,  

76. super,   private , override, public, protected, packaged

77.

public static boolean connect(String word1, String word2) {
	return (word1.charAt(0) == word2.charAt(word2.length - 1)) || (word2.charAt(0) ==
			word1.charAt(word1.length - 1));
}

78.

public static int searchForProbe(int[] theSeries, int theProbe) {
	int count = 0;
	for (int i = 0; i < theSeries.length; i++) {
		if (theSeries[i] == theProbe) {
			count++
		}
	}
	return count;
}

79.

public static int searchInRange(int[] theSeries, double theLow, double theHigh) {
	int count = 0;
	for (int i = 0; i < theSeries.length; i++) {
		if ((theSeries[i] > theLow) && (theSeries[i] < theHigh)) {
			count++
		}
	}
	return count;
}

80. 

public static int searchExRange(double[] theSeries, double theLow, double theHigh) {
	int count = 0
	for (int i = 0; i < theSeries.length; i++) {
		if ((theSeries[i] <= theLow) || (theSeries[i] <= theHigh)) {
			count++
		}
	}
	return count;
}

81.

public static double seriesProduct(double base, int power) {
	double product = 1; 
	for (int i = 1; i <= power; i++) {
		product *= (base + i);
	}
	return product;
}

82.

public static double seriesSum(double base, double diff, int power) {
	double sum = 0
	for (int i = 1; i <= power; i++) {
		sum += (base * Math.pow(diff, i))
	}
	return sum;
}

83.

public static double conditionalSum(double base, double ratio, int power) {
	if ((ratio == 0) || (power < 0)) {
		return 0;
	}
	double sum = 0;
	for (int i = 1; i <= power; i++) {
		sum += (base / Math.pow(ratio, i))
	}
	return sum;
}

84.

public static double invSquareSum(int maximum) {
	double sum = 0;
	for (int i = 1; i <= maximum; i++) {
		sum += (1 / Math.pow(i, 2));
	}
	return sum;
}

85.

public static 

		



		

		







	
	
		
	
		
				