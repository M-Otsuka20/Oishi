
/*
 * ここが画面
 * JFrameを継承することによってこのクラスの中でJFrameの色んな機能が使えるようになる
 * 数字や文字を指定するものは引数で仮作成し、Mainクラスで指定する
 */

import javax.swing.JFrame;//画面を作成するクラス(Listなどと同じ感覚)

public class Gamen extends JFrame {
	public Gamen(String title, int width, int hight) {
		//ウィンドウのサイズを指定
		setSize(width, hight);

		//ウィンドウの位置を、画面の中心へ
		setLocationRelativeTo(null);

		//×を押してアプリが終了するようにする
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//ウィンドウのサイズを変更できないようにする
		setResizable(false);

		//ウィンドウを表示する
		setVisible(true);

	}

}
