public class MegaBytesConverter {
    //Method that converts and prints out kilobytes to megabytes conversion
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        //Checks if kiloBytes is less than zero
        //Prints out Invalid Value if true
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            //Variable that converts kiloBytes to megaBytes
            int megaBytes = kiloBytes / 1024;
            //Variable that gets the remaining amount of bytes after converting
            int remainderBytes = kiloBytes % 1024;
            //Prints out kiloBytes, megaBytes, and Remaing Bytes
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderBytes + " KB");
        }
    }
}
