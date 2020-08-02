/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
package intercitydeliveryservices;
/**
*
* @author John
*/
import java.io.*;
public class KeyboardReader
{
public static void main (String[] args) throws java.io.IOException
{
}
private BufferedInputStream bis;
private boolean eofile;
public KeyboardReader()
{
bis = new BufferedInputStream( System.in );
}
public
String getLenString( int len )
{
if( len <= 0 )
return null;
StringBuffer sb = new StringBuffer();
int i = len;
char c = getChar();
while( (int)c != 0 && i != 0 )
{
sb.append( c );
i--;
if( i != 0 )
c = getChar();
}
return new String( sb );
}
public
String getDelimString( char del )
{
StringBuffer sb = new StringBuffer();
char c = getChar();
while( (int)c != 0 && c != del )
{
sb.append( c );
c = getChar();
}
return new String( sb );
}
public
String getDelimString( String delstr )
{
StringBuffer sb = new StringBuffer();
char c = getChar();
while( (int)c != 0 && delstr.indexOf( c ) == -1 )
{
sb.append( c );
c = getChar();
}
return new String( sb );
}
public
void skipWhite()
{
int bt;
char c = '~';
try
{
bis.mark( 1 );
bt = bis.read();
c = (char)bt;
while( bt != -1 && Character.isWhitespace( c ) )
{
bis.mark( 1 );
bt = bis.read();
c = (char)bt;
}
if( bt == -1 )
{
eofile = true;
return;
}
}catch( IOException oie )
{
eofile = true;
return;
}
try
{
bis.reset();
}catch( IOException anotherioe )
{
return;
}
}
public
String getNonWhite()
{
skipWhite();
StringBuffer sb = new StringBuffer();
char c = getChar();
while( (int)c != 0 && !Character.isWhitespace( c ) )
{
sb.append( c );
c = getChar();
}
return new String( sb );
}
public
String getWord()
{
return getNonWhite();
}
public
String getLine()
{
return getDelimString( '\n' ).trim();
}
public
char getChar()
{
int bt;
try
{
bt = bis.read();
if( bt == -1 )
{
eofile = true;
return (char)0;
}
}catch( IOException ioe )
{
eofile = true;
return (char)0;
}
return (char)bt;
}
public int getInt( String prompt )
{
System.out.print( prompt+" " );
System.out.flush();
String s = getNonWhite();
try
{
int result = Integer.parseInt( s );
return result;
}
catch( NumberFormatException e )
{
System.err.println( s + " is not a correctly formatted integer.");
System.err.println( "... try again..." );
return getInt( prompt );
}
}
public
int getInt()
{
int val = Integer.parseInt( getNonWhite() );
return val;
}
public
double getDouble()
{
Double d = new Double( getNonWhite() );
return d.doubleValue();
}
public
boolean eof()
{
return eofile;
}
public
void skip( long n )
{
try
{
bis.skip( n );
}catch( IOException ioe )
{
return;
}
}

