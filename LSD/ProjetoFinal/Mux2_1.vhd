library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity Mux2_1 is
	port(sel 	 : in std_logic;
		  dataln0 : in std_logic_vector(9 downto 0);
		  dataln1 : in std_logic_vector(9 downto 0);
		  out1    : out std_logic_vector(9 downto 0));

end Mux2_1;

architecture BehavProc of Mux2_1 is
begin
	process(sel, dataln0, dataln1)
	begin
		if (sel = '0') then
			out1 <= dataln0;
		else
			out1 <= dataln1;
		end if;
	end process;
end BehavProc;