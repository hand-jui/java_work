package ex03;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//메인 스레드 -> 화면에 그림 그리고 키보드 이벤트 리스너 받고 있음 -> 바쁨
//백그라운드에서 계속 Player의 움직임을 관찰하는 기능을 줄 것임
public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스객체에 사용하는 이미지 경로 및 파일명 확인");
		}
	}

	@Override
	public void run() {
//		계속 시킬 동작을 정의하면 된다.
//		시작은 Thread 안에 있는 start 메서드를 호출하면 동작된다.
		while (true) {
			// 색상확인
			// 왼쪽으로 갈 때는 좌표 지점을 보정해야 하고 오른쪽으로 갈 때는 기준 좌표 지점을 보정해야 한다.
			// 기준 왼쪽 // 기준 오른쪽
			Color leftColor = new Color(image.getRGB(player.getX() + 10, player.getY()));
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY()));

			if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				player.setRight(false);
//				벽에 충돌했다<--
				player.setRightWallCrash(true);
			} else if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				player.setLeft(false);
				player.setLeftWallCrash(true);
			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} // end of while
	}
}
