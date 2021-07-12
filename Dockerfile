FROM maven:3.5.2-jdk-8

COPY src /src

RUN javac src/main/java/com/azhya/Main.java

CMD java -classpath src/main/java com.azhya.Main