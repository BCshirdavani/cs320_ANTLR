
grammar DataModel;

start 			: datamodel;
datamodel 		: value;
value			: object | array | TEXT | encapsulated;
object			: '<' keyvalue (',' keyvalue)* '>';

keyvalue		: KEY '->' value;
KEY 			: '"' ([a-z]+ | [A-Z]+)+ '"';
array			: '[' value  (',' value)* ']';
TEXT			: [a-z]+ | [A-Z]+ | [0-9]+ | [:.'/\\"]+;
/*STRING			: (~[0-9])+;*/
/*NUM				: [0-9]+;*/
encapsulated		: '"' TEXT '"';

WS 			: [ \t\r\n]+ -> skip;




