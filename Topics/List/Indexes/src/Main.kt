fun solution(products: List<String>, product: String) {
    var index = 0
    for (aProduct in products) {
        index++
        if (aProduct == product) {
            print("${index - 1} ")
        }
    }
}