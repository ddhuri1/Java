/**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf);
 */
public class Solution extends Reader4 {
   /*
    public int read(char[] buf6, int n) {
        int count = 0;
        char[] buf = new char[n];
        int ptr = 0;
        int maxCount = 0;
        while(true){
            char[] buffer = new char[4];
            count = read4(buffer);
            maxCount+= count;
            int i = 0;
            int limit = (maxCount < n) ? maxCount : n;
            while(ptr < limit){
                buf[ptr++] = buffer[i++];
            }
            if(count <= 3) {
                break;
            }
        }
        for(int k = 0 ; k < ptr; k++){
            buf6[k] = buf[k];
        }
        return (maxCount < n) ? maxCount : n;
    }
*/

///----------------------MULTIPLE CALL READS-----------------------------------------
 /**
 * The read4 API is defined in the parent class Reader4.
 *     int read4(char[] buf);
 */

int ptr = 0;
int count = 0;
char[] tmp = new char[4];    

public int read(char[] buf, int n)
{
    int len = 0;
    while (len < n) //read only till n
    {
        if (ptr == 0) //if temp has var sill do not call read4
            count = read4(tmp);
        if (count == 0) break; // eof
        while (len < n && ptr < count) //copy to op buffer
        {
            buf[len] = tmp[ptr];
            len++;
            ptr++;
        }
        if (ptr >= count) //reset ptr
            ptr = 0;
    }
    return len;
}
}
