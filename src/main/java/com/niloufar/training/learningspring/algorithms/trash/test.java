//mport java.util.*;
//import java.io.*;
//import java.math.*;
//
//class Player {
//
//    public static String solve(int clawPos, int[] boxes, boolean boxInClaw) {
//
//        StringBuilder commandLog = new StringBuilder();
//        String result = "";
//        int totalBoxes = Arrays.stream(boxes).sum();
//        int numStacks = boxes.length;
//        int targeHeight = totalBoxes / numStacks;
//        int excessBoxes = totalBoxes % numStacks;
//        // Write your code here
//        System.err.println("Debug messages...");
//        while (!isBalanced(boxes, targeHeight, excessBoxes)) {
//            if (!boxInClaw) {
//                if (boxes[clawPos] > targeHeight) {
//                    boxes[clawPos]--;
//                    boxInClaw = true;
//                    commandLog.append("PICK");
//                    result = "PICK";
//                    System.err.print(result);
//                } else {
//                    if (clawPos < numStacks - 1) {
//                        clawPos++;
//                        commandLog.append("RIGHT");
//                        result = "RIGHT";
//                    } else {
//                        clawPos--;
//                        commandLog.append("LEFT");
//                        result = "LEFT";
//                    }
//                }
//            } else {
//                if (boxes[clawPos] < targeHeight || (excessBoxes > 0 && boxes[clawPos] == targeHeight)) {
//                    boxes[clawPos]++;
//                    boxInClaw = false;
//                    if (excessBoxes > 0) {
//                        excessBoxes--;
//                        commandLog.append("PLACE");
//                        result = "PLACE";
//                    } else {
//                        if (clawPos > 0) {
//                            clawPos--;
//                            commandLog.append("LEFT");
//                            result = "LEFT";
//                        } else {
//                            clawPos++;
//                            commandLog.append("RIGHT");
//                            result = "RIGHT";
//                        }
//                    }
//                }
//            }
//        }
//        commandLog.toString().trim();
//        return result;
//    }
//
//    public static boolean isBalanced(int[] stacks, int targetHeight, int excessBoxes) {
//        int countExtra = 0;
//
//        for (int stack : stacks) {
//            if (stack > targetHeight) return false;
//            if (stack == targetHeight + 1) countExtra++;
//        }
//        return countExtra == excessBoxes;
//    }
//    /* Ignore and do not change the code below */
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//
//        // game loop
//        while (true) {
//            int clawPos = in.nextInt();
//            boolean boxInClaw = in.nextInt() != 0;
//            int stacks = in.nextInt();
//            int[] boxes = new int[stacks];
//            for (int i = 0; i < stacks; i++) {
//                boxes[i] = in.nextInt();
//            }
//            PrintStream outStream = System.out;
//            System.setOut(System.err);
//            String action = solve(clawPos, boxes, boxInClaw);
//            System.setOut(outStream);
//            System.out.println(action);
//        }
//    }
//    /* Ignore and do not change the code above */
//}