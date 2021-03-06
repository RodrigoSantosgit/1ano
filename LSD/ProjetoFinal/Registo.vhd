library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity Registo is
	port(clk: in std_logic;
		  dataIn	: in 	std_logic_vector (9 downto 0);
		  dataOut: out std_logic_vector (9 downto 0));
end Registo;

architecture Behavioral of Registo is
begin
	process(clk)
	begin
		if (rising_edge(clk)) then	
				dataOut <= dataIn;
		end if;
	end process;
end Behavioral;