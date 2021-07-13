src = src/main/java
src_test = src/test/java
package_path = nz/ac/auckland/softeng281
package= nz.ac.auckland.softeng281

bin = bin
classpath = $(bin):lib/junit-4.13.1.jar:lib/hamcrest-core-1.3.jar

all: clean dependencies build run 

build:
	javac -cp $(classpath) -d $(bin) $(src)/$(package_path)/**.java $(src_test)/$(package_path)/**.java

run: clean
	java -cp $(classpath) org.junit.runner.JUnitCore $(package).MaxNumbersTest

dependencies:
	which java javac

clean:
	rm -rfv $(bin)/*
