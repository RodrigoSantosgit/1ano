library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.NUMERIC_STD.all;

entity BCD2Bin is
	port(bcd_1  : in std_logic_vector(3 downto 0);
		  bcd_0  : in std_logic_vector(3 downto 0);
		  bin_out : out std_logic_vector(5 downto 0));
end BCD2Bin;

architecture BehavProc of BCD2Bin is

	constant ten : unsigned(3 downto 0) := to_unsigned(10,4);
	signal s_bin_out : unsigned(7 downto 0);
begin

	s_bin_out <= (unsigned(bcd_1)*ten + unsigned(bcd_0));
	bin_out <= std_logic_vector(s_bin_out(5 downto 0));
	
end BehavProc;