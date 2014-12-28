#include <iostream>
using namespace std;

void reverse(char* str){
	int length = strlen(str);
	int low = 0;
	int high = length-1;
	if (length%2!=0){
		while (low != high){
			char begin = str[low];
			char end = str[high];
			str[low] = end;
			str[high] = begin;
			low++;
			high--;
		}
	}
	else {
		while(low - high !=1){
			char begin = str[low];
			char end = str[high];
			str[low] = end;
			str[high] = begin;
			low++;
			high--;
		}
	}	
}

int main(){
	char mystring[]="Hello";
	char mystring2[]="onetwo";
	reverse(mystring);
	reverse(mystring2);
	cout<<mystring<<endl;
	cout<<mystring2<<endl;
}