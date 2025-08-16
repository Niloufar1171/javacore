package com.niloufar.training.learningspring.Implementation.RobotVacume;

class RobotVacuum {
    private int x, y;
    private char[][] grid;
    private int battery;
    private int chargingX, chargingY;

    public RobotVacuum(char[][] grid, int startX, int startY, int battery, int chargingX, int chargingY) {
        this.grid = grid;
        this.x = startX;
        this.y = startY;
        this.battery = battery;
        this.chargingX = chargingX;
        this.chargingY = chargingY;
    }

    public void move(String direction) {
        if (battery <= 0) {
            System.out.println("Battery empty! Returning to charger...");
            moveToCharger();
            return;
        }

        int newX = x, newY = y;

        switch (direction) {
            case "UP": newX--; break;
            case "DOWN": newX++; break;
            case "LEFT": newY--; break;
            case "RIGHT": newY++; break;
        }

        if (isValidMove(newX, newY)) {
            x = newX;
            y = newY;
            battery--;
            System.out.println("Moved to (" + x + ", " + y + "). Battery: " + battery);

            if (x == chargingX && y == chargingY) {
                recharge();
            }
        } else {
            System.out.println("Invalid move or obstacle detected!");
        }
    }

    private boolean isValidMove(int newX, int newY) {
        return newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] != 'X';
    }

    private void moveToCharger() {
        System.out.println("Returning to charger at (" + chargingX + ", " + chargingY + ")...");
        x = chargingX;
        y = chargingY;
        recharge();
    }

    private void recharge() {
        System.out.println("Recharging...");
        battery = 100;
        System.out.println("Battery full!");
    }

    public static void main(String[] args) {
        char[][] grid = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', ' ', 'X', ' '},
                {'X', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', 'C'}
        };

        RobotVacuum robot = new RobotVacuum(grid, 0, 0, 10, 4, 4);

        robot.move("RIGHT");
        robot.move("DOWN");
        robot.move("DOWN");
        robot.move("RIGHT");
        robot.move("RIGHT");
        robot.move("DOWN");
        robot.move("DOWN");
    }
}
