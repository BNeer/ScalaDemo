for (arg <- args) println(arg)

for (i <- 0 to 5) println(i)

for (i <- 0 to 10 by 2) println(i)


//       ******Difference between yield and println*******
//In Scala, yield is used within a for comprehension to transform elements of a collection
// into a new collection while preserving the structure of the original collection.

// yield allows you to construct a new collection by applying a transformation or filter operation
// to each element of the original collection. This is particularly useful when you want to
// create a new collection based on the elements of an existing one without modifying the original
// collection.


val x = for (i <- 1 to 5) yield i * 2
