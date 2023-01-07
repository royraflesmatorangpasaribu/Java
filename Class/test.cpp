#include<ncurses/ncurses.h>
#include<windows.h>

int main(){
	initscr();
	while(true){
		clear();

		mvprintw(1,5," | ");
		refresh();
		Sleep(500);

		mvprintw(1,5," - ");
		refresh();
		Sleep(500);

		mvprintw(1,5," / ");
		refresh();
		Sleep(500);

	}
}