val result = i match {
    case 1 => "one"
    case 2 => "two"
    case _ => "not 1 or 2"
}




val booleanAsString = bool match{
    case true => "true"
    case false => "false"
}


val x = 5
def classAsString(x: Any):String = x match {
    case s: String => s + "is a String"
    case i: int => "int"
    case f: float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown"
}

