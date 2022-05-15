package leetcode.problem2

class Driver {
    init {
        val l1 = newNode(1)
        val l2 = newNode(1).apply { next = newNode(2) }
        val l3 = newNode(1).apply { next = newNode(2).apply { next = newNode(3) } }
        Solution().addTwoNumbers(l2,l3).print()
    }
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0
        var resultParent = ListNode(0)
        var current = resultParent
        var p = l1
        var q = l2

        while (p != null || q != null) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0
            val sum = x + y + carry

            carry = sum / 10
            current.next = ListNode(sum.rem(10))

            current = current.next!!
            p = p?.next
            q = q?.next

        }

        if (carry == 1)
            current.next = ListNode(1)

        return resultParent.next
    }
}

//Example:
//var li = ListNode(5)
//var v = li.`val`
//Definition for singly-linked list.
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun ListNode?.print() {
    this?.let {
        print(`val`)
        next?.let {
            print(" -> ")
            it.print()
        }
    }
}

fun ListNode?.printInts() {
    this?.let {
        it.toIntList().forEachIndexed { index, value ->
            if (index != 0) print(" -> ")
            print(value)
        }
    }
}

fun newNode(value: Int = 1) = ListNode(value)

fun Int.add(value: Int?): Int {
    if (value == null) return this
    return this + value
}

fun ListNode.toIntList(): List<Int> {
    return mutableListOf(`val`).also { list ->
        this.next?.let { node ->
            list.addAll(node.toIntList())
        }
    }
}
