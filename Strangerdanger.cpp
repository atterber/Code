/*This program was designed for the purpose returning
billing information, coupon output values,
mathematical models and customer data.

-input value will be a sql file linked to website.
-if sql file changes this program will be executed.*/

#include <stdlib.h>
#include<stdio.h>
#include <iostream>
#include<sstream>
#include <string>
#include <iomanip>
#include <fstream>
#include <cstring>
#include <cmath>
#include<vector>
#include<ctime>
#include<conio.h>


using namespace std;

class getData
{
	//getData(){};
	//~getData();

private:
	std::string myline1;

public:
	int m_num, m_numDay, m_numMonth, m_numYear, m_perCent;
	double m_num1, m_average = 0.0, m_totperdays = 2.0, m_averperday = 0.0;
	std::string m_snum, m_snum1, m_snum2, m_snum3, m_sendMail, m_sendEmail, m_snumday;

	void getSalesData(std::string myline1);
	void getCouponData(std::string myline, string perCent);
	//////////////////////////////////////////Function to return length of line///////////////////////////////////
	int processstranger(std::string line)
	{
		int strang = line.length();
		return strang;
	}

	int rdn(int y, int m, int d)
	{ 
		if (m < 3)
		{
			y--, m += 12;
		}
		return 365 * y + y / 4 - y / 100 + y / 400 + (153 * m - 457) / 5 + d - 306;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
};

void getData::getSalesData(std::string myline1)
{
	int k = 0;
	//int count = std::count(myline1.begin(), myline1.end(), ',');
	for (int i = 0; i <= processstranger(myline1); i++)
	{
		if (processstranger(myline1) == i)
		{
			string m_strTemp, m_strTemp1, m_strTemp2;
			string m_strDay, m_strMonth, m_strYear;

			m_num = atoi(m_snum.c_str());
				
			///////////////////////Format day,month,year///////////////////////
			m_strTemp = m_snum[2];
			m_strDay = m_snum[3];
			m_strDay = m_strTemp + m_strDay;
			m_numDay = atoi(m_strDay.c_str());
			
			m_strTemp = m_snum[0];
			m_strMonth = m_snum[1];
			m_strMonth = m_strTemp + m_strMonth;
			m_numMonth = atoi(m_strMonth.c_str());
			m_strMonth.clear();

			m_strTemp = m_snum[4];
			m_strTemp1 = m_snum[5];
			m_strTemp2 = m_snum[6];
			m_strYear = m_snum[7];
			m_strYear = m_strTemp + m_strTemp1 + m_strTemp2 + m_strYear;
			m_numYear = atoi(m_strYear.c_str());
			m_snum.clear();
			/////////////////////////////////////////////////////////////

			m_num1 = atof(m_snum1.c_str()); //string to double
			m_snum1.clear();

			/*if (k == count)
			{
				k = 0; //reset comma counter at endline
			}*/
		}
		else if (myline1[i] == ',') //Search for ,
		{
			k++; //Comma Counter
		}
		else
		{
			if (k == 2)
			{
				m_snum += myline1[i];
			}
			if (k == 3)
			{
				m_snum1 += myline1[i];
			}
		}
	}
}

void getData::getCouponData(std::string myline, string m_perCent)
{
	int k = 0;
	for (int i = 0; i <= processstranger(myline); i++)
	{
		if (processstranger(myline) == i)
		{
			std::cout << m_snum2 << endl; //print at end of line
		}
		else if (myline[i] == ',')
		{
			k++; //Comma Counter
		}
		else
		{
			if (k == 5 && myline[i] == ' ')
			{
				m_snum2 = "Customer receives sales coupon (" + m_perCent + "% off) by mail: " + m_sendMail;
			}
			else if (k == 5 && myline[i] != ' ')
			{
				m_sendEmail += myline[i];
				m_snum2 = "Customers receives sales coupon (" + m_perCent + "% off) by email: " + m_sendEmail;
			}
			else if (k == 1 || k == 2 || k == 3 || k == 4)
			{
				m_sendMail += myline[i];
			}
		}
	}
}

void getDate(int Day, int Month, int Year)
{

	cout << "Todays date: " << Month << "/" 
		 << Day << "/" << Year << endl;
}

int main()
{
	time_t current_time = time(NULL);
	struct tm  local_time;
	localtime_s(&local_time, &current_time);

	int Year = local_time.tm_year + 1900;
	int Month = local_time.tm_mon + 1;
	int Day = local_time.tm_mday;
	int max = 5, numday = 1, totaldays = 0;
	double total = 0.0, totperdaymin = 0.4, average = 10, totperdays = 2.0, averperday = 0.0;
	
	std::vector<int> nums, numsDay, numsMonth, numsYear;
	std::vector<double> nums1;
	
	std::ifstream inputfile, inputfile1;
	std::ofstream outfile;
	std::string myline, myline1;

	getDate(Day, Month, Year);

	inputfile1.open("C:\\Users\\Wally\\Desktop\\strangerorderinfo.txt");
	inputfile1.ignore(std::numeric_limits<std::streamsize>::max(), '\n'); //Skip first line (l=0)
	///////////////////////////////////Customer order info first////////////////////////////////////////
	
	getData getV;
	while (!inputfile1.eof())
	{
		getline(inputfile1, myline1);
		getV.getSalesData(myline1);
		nums.push_back(getV.m_num);
		nums1.push_back(getV.m_num1);

		numsDay.push_back(getV.m_numDay);
		numsMonth.push_back(getV.m_numMonth);
		numsYear.push_back(getV.m_numYear);
	}
	inputfile1.close();
	////////////////////////////////////////////////////////////////////////////////////////


	std::cout << "***********************Data Section******************************" << std::endl;
	std::cout << "Purchasing Dates: ";
	for (int i = 0;i < nums.size(); i++)
	{
		std::cout << numsMonth[i] << "/" << numsDay[i] << "/" << numsYear[i] << " ";
	}

	std::cout << std::endl << "Purchasing Amounts: ";
	for (int i = 0;i < nums1.size(); i++)
	{
		std::cout << nums1[i] << " ";
		total = total + nums1[i];
		average = total / (nums1.size() - 1);
		totaldays = getV.rdn(Year, Month, Day) - getV.rdn(numsYear[0], numsMonth[0], numsDay[0]); //Assumes first date point is oldest
		averperday = total / totaldays;
	}
	std::cout << std::endl << "************************************************************************" << std::endl << std::endl << std::endl;
	//////////////////////////////////////////////////


	/////////////////Print Comps/////////////////////
	std::cout << "***********************Calculation Section******************************" << std::endl;
	std::cout << "The total purchasing amount is: " << total << std::endl;
	std::cout << "The average purchasing amount is: " << average << std::endl;
	std::cout << "The total days is: " << totaldays << std::endl;
	std::cout << "The total purchasing amount per day is: " << averperday << std::endl;
	std::cout << "************************************************************************" << std::endl << std::endl << std::endl;
	///////////////////////////////////////////////End Of Comp Section////////////////////////////////////////////////////////


	///////////////////////////////////////////Start of Validation Statement///////////////////////////////////////////
	///////////////////////////Runs once a day the input will be a different sql format////////////////////////////////////
	std::cout << "******************Sales Coupon Information******************************" << std::endl;

	inputfile.open("C:\\Users\\Wally\\Desktop\\strangers.txt");
	inputfile.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
	
	getData getC;
	while (!inputfile.eof())
	{
		getline(inputfile, myline);
		switch (averperday < totperdays)
		{
		case 1: if(totperdaymin < averperday)
				{ 
					getC.getCouponData(myline, "10");
					break;
				}
				else
				{
					getC.getCouponData(myline, "20");
					break;
				}
		default: std::cout << "Not eligible to be sent a sales coupon"<<std::endl;
		break;
		}
	}
	
	inputfile.close();
	///////////////////////////////////////////End of Validation Statement///////////////////////////////////////////
	std::cout << "************************************************************************" << std::endl;
	cin.get();
	return 0;
}

