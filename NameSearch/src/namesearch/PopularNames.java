/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package namesearch;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class PopularNames {
    private String[] names;
    /**
     * Constructor 
     * @param filename Name of the file to read
     *      census names from.
     * @throws IOException When a file I/O error occurs.
     */
    public PopularNames(String filename) throws IOException{
        //Create the file stream objects.
        FileReader freader = new FileReader(filename);
        BufferedReader inFile = new BufferedReader(freader);
        //Get the number of lines in the file.
        //Create an array large enough to hold all the 
        //Strings in the file.
        //Read the names from the file into the array.
        //Close the file.
        inFile.close();
        //Sort the name.
        quickSort();
    }
    /**
     * The sear method performs a binary search on the names array.  If the search
     * value is found, its array subscript is returned.  Otherwise -1 is returned
     * indicating the search value was not found in the array.
     * @param value The string to search for.
     * @return The subscript of the name if it was found; -1 otherwise.
     */
    public int search(String value){
        int first;  //First names element
        int last;   //Last names element
        int middle; //Mid point of search
        int position;  //Position of search value
        boolean found; //Flag
        
        //Set the initial value.
        //Search for the value.
        //Return the position of the item, or -1
        return position;
        //if it was not found.
    }
    /**
     * The numLines method counts the number of lines
     * in a text file.
     * @param filename Name of the file to read.
     * @return The number of lines in the file.
     * @throws IOExecption When a file I/O error occurs.
     */
    private int numLines(String filename) throws IOException{
        //Create the file stream objects.
        //Initialize a counter.
        //Read the remaining contents and count
        //the lines that are read.
        //Close the file.
        //Return the number of lines.
    }
    /**
     * The quickSort method calls the doQuickSort method
     * to sort the names array.
     */
    private void quickSort(){
         doQuickSort(names, 0, names.length -1);
    }
    /**
     * The doQuickSort method uses the QuickSort algorithm
     * to sort an array of strings.
     * @param array The array to sort.
     * @param start The starting subscript of the list to sort.
     * @param end The ending subscript of the list to sort.
     */
    private void doQuickSort(String array[], int start, int end){
        int pivotPoint;
        if(start<end){
            //Get the pivot point.
            pivotPoint = partition(array, start, end);
            //Sort the first sub list.
            doQuickSort(array, start, pivotPoint -1);
            //Sort the second sub list.
            doQuickSort(array, pivotPoint + 1, end);
        }
    }
    /**
     * The partition method selects a pivot value in an array and arranges the array
     * into two sub lists.  All the values less that the pivot will be stored in the left
     * sub list and all the values greater that or equal to the pivot will be stored in 
     * the right sub list.
     * @param array The array to partition.
     * @param start The starting subscript of the area to partition.
     * @param end The ending subscript of the area to partition.
     * @return The subscript of the pivot value.
     */
    private in partition(String array[], int start, int end){
        String pivotValue;  //To hold the pivot value.
        int endOfLeftList;  //Last element in the left sub list.
        int mid;            //To hold the mid-point subscript.
        //Find the subscript of the middle element.
        //This will be our pivot value.
        //Swap the middle element with the first element.
        //This moves the pivot value to the start of the list.
        //Save the pivot value for comparisons.
        //For now, the end of the left sub is 
        //the first element.
        //Scan the entire list and move any values that 
        //are less than the pivot value to the left
        //sub list.
        //Move the pivot value to end of the 
        //left sub list.
        //Return the subscript of the pviot value.
    }
    /**
     * The swap method swaps the contents of two elements 
     * in an array of String objects.
     * @param The array containing the two elements.
     * @param a The subscript of the first element.
     * @param b The subscript of the second element.
     */
    private void swap(String[] array, int a, int b){
        
    }
}
