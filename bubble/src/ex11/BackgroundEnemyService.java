package ex11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//메인 스레드 -> 화면에 그림 그리고 키보드 이벤트 리스너 받고 있음 -> 바쁨
//백그라운드에서 계속 Player의 움직임을 관찰하는 기능을 줄 것임
public class BackgroundEnemyService implements Runnable {

	private BufferedImage image;
	private Enemy enemy;

	private int JUMPCOUNT = 0;
	private int FIRST = 0; // 바닥 도착 여부 0, 꼭대기 1
	private int BOTTOMCOLOR = -1;

	public BackgroundEnemyService(Enemy enemy) {
		this.enemy = enemy;
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
		while (enemy.getState() == 0) {
			// 기준 왼쪽 // 기준 오른쪽
			Color leftColor = new Color(image.getRGB(enemy.getX(), enemy.getY() + 25));
			Color rightColor = new Color(image.getRGB(enemy.getX() + 60, enemy.getY() + 25));

//			바닥 충돌 감지
//			Color bottomColorLeft = new Color(image.getRGB(player.getX(), player.getY() + 60));
			int bottomColorLeft = image.getRGB(enemy.getX() + 20, enemy.getY() + 55);
			int bottomColorRight = image.getRGB(enemy.getX() + 40, enemy.getY() + 55);
			System.out.println("bottomColorLeft" + bottomColorLeft);
			System.out.println("bottomColorRight" + bottomColorRight);
//			-1 ,-1 == 공중
			if (bottomColorLeft + bottomColorRight != -2) {
				enemy.setDown(false);
			} else {
				if (!enemy.isUp() && !enemy.isDown()) {
					enemy.down();
				}
			}

//			외벽충돌 확인
//			바닥 도착
			if ((bottomColorLeft + bottomColorRight) == BOTTOMCOLOR)
				FIRST = 1;
//			꼭대기 도착
			if (JUMPCOUNT >= 3) {
				JUMPCOUNT = 0;
				FIRST = 0;
			}

//			오른쪽 구석
			if (JUMPCOUNT < 3 && FIRST == 1 && rightColor.getRed() == 255 && rightColor.getGreen() == 0
					&& rightColor.getBlue() == 0) {
				enemy.setRight(false);
				enemy.setLeft(true);
				if (!enemy.isUp() && !enemy.isDown()) {
					JUMPCOUNT++;
					if (JUMPCOUNT == 3)
						enemy.left();
					enemy.up();
				}
//			왼쪽 구석
			} else if (JUMPCOUNT < 3 && FIRST == 1 && leftColor.getRed() == 255 && leftColor.getGreen() == 0
					&& leftColor.getBlue() == 0) {
				enemy.setLeft(false);
				enemy.setRight(true);
				if (!enemy.isUp() && !enemy.isDown()) {
					JUMPCOUNT++;
					if (JUMPCOUNT == 3)
						enemy.right();
					enemy.up();
				}
			} else if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				enemy.setLeft(false);
				if (!enemy.isRight()) {
					enemy.right();
				}
			} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				enemy.setRight(false);
				if (!enemy.isLeft()) {
					enemy.left();
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // end of while
	}
}
