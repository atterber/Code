Code
====

Showing code test

#include <stdlib.h>
#include <iostream>
#include <iomanip>
#include <fstream>
#include <cstring>
#include <cmath>
#include <vector>

//This program returns if/how a custumer should be awarded a sales coupon.
//This program uses two input files. 
//The first file gives custumer information. 
//The second file gives custume order information.
//If the custume information list is incomplete the program will state "Does not validate."
//If a certain amount is spent and after a certain number of day
//The program will then return a suitable  

using namespace std;
int processstranger(string line);

int main()
{
    int N,i,k,p,j,l,m;
    int max,days, numday, totaldays;
    int vtyp=0;
    double num, num1, total, average, totperdays;
    vector<int> nums;
    vector<int> numsday;
    vector<double> nums1;
    string snum,snum1,snum2,snum3,snumday;
    ifstream inputfile, inputfile1;
    ofstream outfile;
    string myline, myline1;
    double averperday; 
    
    inputfile.open("C:\\Users\\Wally\\Desktop\\strangers.txt"); 
    //inputfile.open("C:\\Users\\Wally\\Desktop\\strangers1.txt"); 
    inputfile1.open("C:\\Users\\Wally\\Desktop\\strangerorderinfo.txt");
    k=0;
    p=0;
    l=0;
    
cout<<"Enter max length of data file to be analyzed: ";
cin>>max;

cout<<endl;

cout<<"Enter how many days past the last purchase date you want to average: ";
cin>>days;

cout<<endl;

cout<<"Enter the lowest total purchase amount per day before sending a sales coupon: ";
cin>>totperdays;

cout<<endl;
cout<<endl;
///////////////////////////////////////////////Start Of Comp Section////////////////////////////////////////////////////////
cout<<"******************Computational Information******************************"<<endl;
while(inputfile1)
{
                 p=p+1;
  getline(inputfile1,myline1);
                           for(i=1; i <= processstranger(myline1); i++)
                           {  
                                                             
                               if(myline1[i]==',') //Search for ,
                               {
                               k=k+1;              //Count ,
                                               if(((k>=2)&&(k<3)) && (p!=1) && (p<=max))
                                               {
                                                j=i+1;
                                                snum=myline1[j];
                                                snum=snum+myline1[j+1]+myline1[j+2]+myline1[j+3]+myline1[j+4]+myline1[j+5];
                                                int num = atoi(snum.c_str()); //string to int
                                                nums.push_back(num);
                                                
                                                snumday=myline1[j+2];
                                                snumday=snumday+myline1[j+3];
                                                int numday=atoi(snumday.c_str()); 
                                                numsday.push_back(numday); //filling vector with ints
                                               }  
                                               
                                               if((k>=3) && (p!=1) && (p<=max))
                                               {
                                                j=i+1;
                                                snum1=myline1[j];
                                                snum1=snum1+myline1[j+1]+myline1[j+2]+myline1[j+3]+myline1[j+4];
                                                double num1 = atof(snum1.c_str()); //string to double
                                                nums1.push_back(num1); //filling vector with ints
                                               }                                  
                               }                                 
                            }
                               k=0;
} 
cout<<"Purchasing Dates: ";      
for(int i=0;i < nums.size(); ++i)
{
     cout << nums[i] << " ";
     
     }
     cout<<endl;

     
 
cout<<"Purchasing Amounts: ";      
for(int i=0;i < nums1.size(); ++i)
{
     cout << nums1[i] << " ";
     }
     cout<<endl;
 total=0; 
 averperday=0;
 totaldays=0; 
  
for(int i=0;i < nums1.size(); ++i)
{
     total=total+nums1[i];
     average=total/nums1.size();
      totaldays=days+numsday[nums1.size()-1]-numsday[0];
      averperday=total/totaldays;  
        }
         /////////////////Print Comps///////////////////
    cout<<"The total purchasing amount is: "<<total<<endl;
    cout<< "The average purchasing amount is: "<< average<<endl;
    cout<< "The total days is: "<< totaldays<<endl;     
      cout<< "The total purchasing amount per day is: "<< averperday<<endl;
      
     
///////////////////////////////////////////////End Of Comp Section////////////////////////////////////////////////////////
cout<<endl;
cout<<endl;
cout<<endl;
///////////////////////////////////////////Start of Validation Statement///////////////////////////////////////////
cout<<"******************Sales Coupon Information******************************"<<endl;

k=0;
p=0;
l=0;

while(inputfile)
{
 getline(inputfile,myline);
                if(l==1)
                {
                           for(i=0; i <= processstranger(myline); i++)
                           {                                   
                                                      if(myline[i]==',')
                                                       {
                                                       k=k+1; //Found a comma
                                                       }
                             }
                }
 
                      
                         
                           if(averperday<totperdays)
                           {
                                            
                                if ((k < 7) && (l==1))
                                   {
                                    cout<<"The cross-dresser ";
                                                for(i=0; i <= processstranger(myline); i++)
                                                {                                  
                                                      if(myline[i]==',')
                                                       {
                                                       k=k+1; //Found a comma
                                                       }
                                                      else
                                                       { 
                                                            if(k==0)
                                                            {
                                                             snum2=myline[i];
                                                              cout<<snum2;
                                                            }  
                                                       }
                                                }
                                                 cout<<" can only be sent a sales coupon via mail (home address). "<<endl; 
                                                 cout<<"He did not validate:"<<endl;
                                                 cout<<myline<<endl;     
                                     } 
                                    
                                     if ((k==7)&& (l==1))
                                   {
                                   cout<<"The cross-dresser ";
                                   for(i=0; i <= processstranger(myline); i++)
                                            {  
                                                               
                                                               if(myline[i]==',')
                                                               {
                                                               k=k+1; //Found a comma
                                                               }
                                                               else
                                                               { 
                                                                    if(k==0)
                                                                    {

                                                                    snum2=myline[i];
                                                                    cout<<snum2;
                                                                     }  
                                                               }
                                             } 
                                             cout<<"can be sent coupon via email and mail (home address). "<<endl;     
                                             cout<<"He did validate:"<<endl;
                                             cout<<myline<<endl;                                         
                                    }   
                             }
                             else
                             {
                                 if(l==1)
                                 {
                             cout<<"Not eligable to be sent a sales coupon"<<endl;
                                 }    
                             }    
                                          
                               
  l=l+1;                              
}
///////////////////////////////////////////End of Validation Statement///////////////////////////////////////////
 cout<<endl;
 cout<<endl;       

    system("PAUSE");
    return 0;
}
//////////////////////////////////////////Function to return length of line///////////////////////////////////
int processstranger(string line)
{      
     int strang = line.length();
      //  cout<<strang<<endl; 
    return strang;   
       }
