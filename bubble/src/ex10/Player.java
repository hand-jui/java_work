package ex10;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	BubbleFrame mContext;

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

//	플레이어의 방향 상태(enum 타입사용 : 데이터의 범주화)
	private PlayerWay pWay;

//	플레이어의 현재 움직임 상태를 기록해야함 컨트롤 가능
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

//	벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;

//	플레이어의 속도
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initData();
		setInitLayout();
	}

//	getter 메서드 만들기 left, right, isLeftWallCrash, isRightWallCrash

//	setter 메서드 만들기 left, right
	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeft() {
		return left;
	}

	public boolean isRight() {
		return right;
	}

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public PlayerWay getpWay() {
		return pWay;
	}

	public void setpWay(PlayerWay pWay) {
		this.pWay = pWay;
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");

		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;
		pWay = PlayerWay.RIGHT;
	}

	private void setInitLayout() {

		x = 500;
		y = 535;
//		좌표기반, 라벨의 크기를 지정해야함
		setSize(50, 50);
		setLocation(x, y);
//		JLabel에 아이콘을 셋팅하는 메서드
		setIcon(playerR);
	}

	@Override
	public void left() {
		pWay = PlayerWay.LEFT; // 2가지
		left = true;
//		한번 키보드 왼쪽 방향키를 누르면 스레드 생성이 된다
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x -= SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
			}
		}).start();
	}

	@Override
	public void right() {
		pWay = PlayerWay.RIGHT;
		right = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x += SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	@Override
	public void up() {
		System.out.println("점프!");
		up = true;
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 120 / JUMPSPEED; i++) {
					y -= JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of for

				up = false;
				down();
			}
		}).start();

	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (down) {
					y = y + JUMPSPEED;
					setLocation(x, y);

					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} // end of while
				down = false;
//				!!상태 값을 다룰 때는 상황이 변하면 초기화 처리를 잘해야함!!
			}
		}).start();
	}

	public void attack() {
		Bubble bubble = new Bubble(mContext);
		mContext.add(bubble);
	}

}
