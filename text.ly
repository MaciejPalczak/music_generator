\version "2.18.2"

\paper {
	#(set-paper-size "a4")
}

\layout {
	indent = 0\in
ragged-last = ##f
	\context {
		\Score
		\remove "Bar_number_engraver"
	}
}\relative c' 
{
\time 3/4 a4 disis2 c4 g16 des'4 c4 c8~ c16. g2. c4. c8. fes,8~ g,2. g1 g2 g1 g1 g8 c1 c,1 g16 g8 g4 g'4 c8~ c8 c,2 deses,16 c16~ c,8. d,16 ges,8 ges,4 g16. g1 
\bar "||"
}