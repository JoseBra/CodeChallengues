function superStack(operations) {
    var stack = []

    operations.forEach( operation => {
        var splitOperation = operation.split(" ")

        if (splitOperation[0] === "push") {
            stack.push(splitOperation[1])
        } else if (splitOperation[0] == "pop") {
            stack.pop()
        } else if (splitOperationz[0] == "inc") {
            for (i = 0; i < numberOfElements; i++) {
                stack[i] = parseInt(splitOperation[2]) + parseInt(splitOperation[1])
            }
        }
        printTopValue(stack)
    })
}

function addToStack(stack, element) {
    stack.push(element)
}

function printTopValue(stack) {
    if (stack.length === 0) {
       process.stdout.write("EMPTY");
    } else {
        process.stdout.write(stack[stack.length - 1]);
    }
    process.stdout.write("\n")
}

function sumToElements(stack, amount, numberOfElements) {
    for (i = 0; i < numberOfElements; i++) {
        stack[i] = Number(stack[i]) + Number(amount)
    }
}