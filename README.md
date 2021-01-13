# Assignment1_APJ2
There are several txt files. You need to search for particular text.
  1)	If there is exact match with the input text. If it is the title or file name put first in the search results, then order by frequency of appearance of this text in the files.
  2)	If there is no exact match, try to search without some words like the, a, in etc. Maybe there is a close match. Then also: if it is the title/file name put first, then order by frequency of appear-ance of this word in the text.
  3)	Try to make such search for pdf files.
  4)	Use threads to search in each file and call another thread to wait and aggregate the results when any other thread finishes the search.
Every item is up to 3 points
  + - - - - - - - - + - - - - - - - - - - + - - - - - - - - - - + - - - - - - + - - - - - - +
  | Extends Thread  | Implements Runnable | Synchronized        | sleep()     | Executors   |
  + - - - - - - - - + - - - - - - - - - - + - - - - - - - - - - + - - - - - - + - - - - - - +
  | Method that     | shutdown(),         | ArrayBlockingQueue  | notify(),   | Use shared  |
  | returns value   | shutdownNow()       |                     | notifyAll() | values      |
  + - - - - - - - - + - - - - - - - - - - + - - - - - - - - - - + - - - - - - + - - - - - - +
Every item is 1 point
  + - - - - - - - + - - - - - + 
  | Good looking  | Rest API  |
  | site          |           |
  + - - - - - - - + - - - - - +
