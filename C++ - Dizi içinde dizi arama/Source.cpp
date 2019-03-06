#include<iostream>

using namespace std;

int linear_search(int A[], int N, int wanted)   //Dizi içinde arama yapan fonksiyon
{
	for (int K = 0; K<N; K++)
		if (A[K] == wanted)
			return K;
	return -1;
}

int main()
{
	int arr[20];
	int wanted_arr[20];
	int size;
	int key;

	for (int i = 0;i < 20;i++)             //Diziye 1-100 arasý rastgele sayýlar atanýyor
	{
		arr[i] = rand() % 100 + 1;
	}


again:										//Etiket

	cout << "Please enter the size of the array you want to search:";
	cin >> size;							//Aranacak  dizinin boyutu isteniyor
	cout << "Please enter the array you want to search" << endl;
	for (int i = 0;i < size;i++)            //Aranacak dizinin elemanlarý isteniyor
	{
		cin >> wanted_arr[i];
	}

	for (int j = 0;j < size; )				//Dizi elemanlarýný aramak için for döngüsü
	{

		key = linear_search(arr, 20, wanted_arr[j]);    //Fonksiyon çaðrýsý

		if (key != -1)                          //sayý dizide bulunursa 
		{
			if (wanted_arr[j] == wanted_arr[size - 1])    //dizinin sonuna gelinirse
			{

				cout << "\t\t\tDizi\t\t\t\t\tAranan Dizi\t\t\tSonuc" << endl;
				for (int i = 0;i < 19;i++)               //Diziyi yazdýrma
				{
					cout << arr[i] << ",";
				}
				cout << arr[19];
				cout << "\t";
				for (int i = 0;i < size - 1;i++)          //Aranan diziyi yazdirma
				{
					cout << wanted_arr[i] << ",";
				}
				cout << wanted_arr[size - 1];           //Sonucu yazdirma
				cout << "\t\t\t VAR" << endl << endl << endl;
				goto again;
			}
			j++;
		}
		else                                //Sayi dizide bulunamazsa
		{
			cout << "\t\t\tDizi\t\t\t\t\tAranan Dizi\t\t\tSonuc" << endl;
			for (int i = 0;i < 19;i++)				//Diziyi yazdirma
			{
				cout << arr[i] << ",";
			}
			cout << arr[19];
			cout << "\t";
			for (int i = 0;i < size - 1;i++)		//Aranan diziyi yazdirma
			{
				cout << wanted_arr[i] << ",";
			}
			cout << wanted_arr[size - 1];              //Sonucu yazdirma
			cout << "\t\t\t YOK" << endl << endl << endl;
			goto again;                          //Etikete git
		}
	}


	getchar();
	getchar();
	getchar();
}