#include <iostream>
#include <string>

using namespace std;

// Fungsi untuk menampilkan daftar harga kamar
void displayPriceList() {
cout << "================================" << endl;
cout << "|Selamat datang di hotel mixue|" << endl;
cout << "================================" << endl;

cout << " Daftar Harga Kamar" << endl;

cout << "1. Kamar standar: Rp. 250.000," << endl;
cout << "2. Kamar deluxe: Rp. 350.000," << endl;
cout << "3. Kamar suite: Rp. 450.000," << endl;
}

//fungsi pembayaran
int payment(int totalPrice){
	int pay;
	char payType;

	cout<<"Silahkan pilih metode pembayaran: "<<endl;
	cout<<"1. Cash"<<endl;
	cout<<"2. Debit"<<endl;
	cout<< "Pilihan anda:"<<payType<<endl;
	cin>>payType;

	switch(payType)
	{
		case '1':
			cout<<"Anda telah memilih cash untuk pembayaran sebesar Rp. "<<totalPrice<<endl;
			pay = 1;
			break;
		case '2':
			cout<<"Anda telah memilih debit untuk pembayaran sebesar Rp. "<<totalPrice<<endl;
			pay = 2;
			break;
		default:
			cout<<"Pembayaran gagal, silakan ulangi lagi"<<endl;
			pay = 0;
			break;
	}
	return pay;

}

int main() {
// Variabel untuk menyimpan pilihan kamar
int roomChoice;

// Variabel untuk menyimpan jumlah kamar yang dipesan
int numRooms;

// Variabel untuk menyimpan nama tamu
string guestName;

//variabel untuk mengetahui apakah jadi memesan pesanan
char confirm;

// Tampilkan daftar harga kamar
displayPriceList();


// Minta input pilihan kamar dari user
cout << "Silakan pilih tipe kamar (1-3): ";
cin >> roomChoice;

// Minta input jumlah kamar yang dipesan dari user
cout << "Berapa kamar yang akan Anda pesan?: ";
cin >> numRooms;

// Minta input nama tamu dari user
cout << "Silakan masukkan nama tamu: ";
cin >> guestName;

//meyakinkankan pesananan tamu
cout << "apakah anda yakin dengan pesanan anda y/t?:";
cin >> confirm;

// Hitung harga total berdasarkan pilihan kamar dan jumlah kamar yang dipesan
int totalPrice;
if (roomChoice == 1) {
totalPrice = numRooms * 250000;
} else if (roomChoice == 2) {
totalPrice = numRooms * 350000;
} else if (roomChoice == 3) {
totalPrice = numRooms * 450000;
} else {
cout << "Maaf, tipe kamar tidak tersedia." << endl;
}

if (confirm == 'y') {
cout << "Terima kasih telah memesan di hotel kami" << endl;
} else {
cout << "Pesanan dibatalkan" << endl;
}



int pay = payment(totalPrice);


     
if(pay == 1){
	cout<<"===================================="<<endl;
	cout<<"	|Hotel Mixue|	  "<<endl;
	cout<<"===================================="<<endl;
    cout << "Pesanan untuk " << guestName << endl;
	cout << "Tipe kamar: ";
	if (roomChoice == 1) {
	cout << "standar";
	} else if (roomChoice == 2) {
	cout << "deluxe";
	} else if (roomChoice == 3) {
	cout << "suite";
	}
	cout << endl;
	cout << "Jumlah kamar: " << numRooms << endl;
	cout << "Total harga: Rp. " << totalPrice  << endl;
	cout<<"===================================="<<endl;

}
  else {
	  cout << "Silakan lihat daftar harga kembali" << endl;
	  displayPriceList();
	  
  } 

}


