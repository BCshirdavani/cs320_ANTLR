grammar DataModel;

start 			: datamodel;
datamodel 		: value;
value			: object | array | TEXT;
object			: '<' keyvalue (',' keyvalue)* '>';

keyvalue		: KEY '->' value;
/*keyvalue		: KEY '->' TEXT;*/
/* KEY 			: [a-z]+ | [A-Z]+ | ["]+; */
KEY 			: '"' ([a-z]+ | [A-Z]+)+ '"';
array			: '[' value  (',' value)* ']';
TEXT			: [a-z]+ | [A-Z]+ | [0-9]+ | [:.'/\\"]+;

WS 				: [ \t\r\n]+ -> skip;






