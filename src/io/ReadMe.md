some important io classes
DataOutputStream and DataInputStream . for read and write binary. has soe feature for read 
for example : readBoolean ,readChar,readDouble,...

BufferedWriter and BufferedReader , BufferedOutputStream and BufferedInputStream : 
input and output buffered , more performance because buffer when is not fully , not write in storage , and when full write in storage
use from method flush if we want when buffer is not fully flush it to storage , 
every read maybe read all data from storage , create buffer for read faster 
BufferedReader is faster than Scanner class because read text from buffer 

ByteArrayOutputStream and ByteArrayInputStream : 
this two class can read and write from storage binary access of bytes 

StringReader and StringWriter :
read and write text in String

PrintStream : 
extend OutputStream , create output in a OutputStream
has several method like print and println like System.out

decorator design pattern : 
objects used in read and write for stream of data , can combination and interaction together 
constructor many io class can get another resource 
for example : 
FileOutputStream fileOutputStream = new FileOutputStream("/home/mohammad/IdeaProjects/base/resources/mohammad.txt");
BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
PrintStream printStream = new PrintStream(bufferedOutputStream);
printStream.println("hi");

