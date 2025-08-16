//function createStack(length, totalBoxes) {
//        const boxPerStack = Math.floor(totalBoxes / length);
//        let newStack = new Array(length).fill(boxPerStack);
//
//        const remainder = totalBoxes % length;
//        if (remainder !== 0) {
//        for (let i = 0; i < remainder; i++) {
//        newStack[i]++;
//        }
//        }
//
//        return newStack;
//        }
//
//        function solve(clawPos, boxes, boxInClaw) {
//        // Write your code here
//        const totalBoxes = boxes.reduce((prev, acc) => prev + acc);
//        let targetPos;
//
//        if (boxInClaw) {
//        const targetStack = createStack(boxes.length, totalBoxes + 1);
//
//        // Move to place
//        for (let i = 0; i < boxes.length; i++) {
//        if (boxes[i] < targetStack[i]) {
//        targetPos = i;
//        break;
//        }
//        }
//
//        if (clawPos === targetPos) return 'PLACE';
//        else if (clawPos < targetPos) return 'RIGHT';
//        else return 'LEFT';
//        } else {
//        const targetStack = createStack(boxes.length, totalBoxes);
//
//        // Move to pick
//        for (let i = 0; i < boxes.length; i++) {
//        if (boxes[i] > targetStack[i]) {
//        targetPos = i;
//        break;
//        }
//        }
//
//        if (clawPos === targetPos) return 'PICK';
//        else if (clawPos < targetPos) return 'RIGHT';
//        else return 'LEFT';
//        }
//
//        return '';
//        }
//        /* Ignore and do not change the code below */
//
//// game loop
//        while (true) {
//        const clawPos = parseInt(readline());
//        const boxInClaw = readline() !== '0';
//        const stacks = parseInt(readline());
//        const boxes = readline().split(' ').map(j => parseInt(j)).slice(0, stacks);
//        const oldWrite = process.stdout.write;
//        process.stdout.write = chunk => { console.error(chunk); return true }
//        const action = solve(clawPos, boxes, boxInClaw);
//        process.stdout.write = oldWrite;
//        console.log(action);
//        }
///* Ignore and do not change the code above */
