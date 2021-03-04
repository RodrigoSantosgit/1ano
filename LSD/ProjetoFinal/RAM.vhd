library IEEE;
use IEEE.std_logic_1164.all;
use IEEE.numeric_std.all;

entity RAM_1P_256_10 is
	port(	clk			: in std_logic;
			address		: in std_logic_vector(7 downto 0);
			writeEnable	: in std_logic;
			writeData   : in std_logic_vector (9 downto 0);
			readData    : out std_logic_vector(9 downto 0));
end RAM_1P_256_10;

architecture RTL of RAM_1P_256_10 is

	subtype Tdata is std_logic_vector(9 downto 0);
	type TMemory is array (0 to 255) of Tdata;
	signal s_memory : Tmemory;
	
	begin
		process(clk)
		begin
			if(rising_edge(clk)) then
				if(writeEnable = '1') then
					s_memory(to_Integer(unsigned(address))) <= writeData;
				end if;
			end if;
		end process;
		
	readData <= s_memory(to_Integer(unsigned(address)));
	
end RTL;